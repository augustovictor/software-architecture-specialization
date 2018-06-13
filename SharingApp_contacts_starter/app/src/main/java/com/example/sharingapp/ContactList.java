package com.example.sharingapp;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by victoraweb on 17/03/18.
 */

class ContactList {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    private String FILENAME = "contacts.sav";

    public void setContacts(ArrayList<Contact> contact_list) {
        this.contacts = contact_list;
    }

    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }

    public ArrayList<String> getAllUsernames() {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Contact> contacts = this.getContacts();

        for (Contact c : contacts) {
            names.add(c.getUsername());
        }

        return names;
    }

    public void addContact(Contact contact) {
        this.getContacts().add(contact);
    }

    public void deleteContact(Contact contact) {
        this.getContacts().remove(contact);
    }

    public Contact getContact(int id) {
        return this.getContacts().get(id);
    }

    public Integer getSize() {
        return this.getContacts().size();
    }

    public Integer getIndex(Contact contact) {
        int pos = 0;
        for (Contact c : contacts) {
            if (contact.getId().equals(c.getId())) {
                return pos;
            }
            pos = pos+1;
        }
        return -1;
    }

    public Boolean hasContact(Contact contact) {
        return this.getContacts().contains(contact);
    }

    public Contact getContactByUsername(String username) {
        Contact contact = new Contact();

        for(Contact c : this.getContacts()) {
            if(username.equals(c.getUsername())) contact = c;
        }

        return contact;
    }

    public void loadContacts(Context context) {
        try {
            FileInputStream fis = context.openFileInput(FILENAME);
            InputStreamReader isr = new InputStreamReader(fis);
            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Contact>>() {}.getType();
            contacts = gson.fromJson(isr, listType); // temporary
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveContacts(Context context) {
        try {
            FileOutputStream fos = context.openFileOutput(FILENAME, 0);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Gson gson = new Gson();
            gson.toJson(contacts, osw);
            osw.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Boolean isUsernameAvailable(String username) {
        return !this.getAllUsernames().contains(username);
    }
}
