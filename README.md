# software-architecture-specialization

## Software architect
- Architecture documentation is about understanding the value of a decision we're gonna make;
- What value I am adding as a software architect?
- Requirements are not our primary driver. Requirements are a fundamental part of a project which is a temporarily limited activity to deliver a set of functions to an organization.
    - Those functions have:
        - Profitability
        - Constituent Value
        - Reuse
        - Grow market size
        - Grow market quality
- The architect asks WHY?
- How does a software developer architecture document is different from a software architect's?
    - Their designs are fundamentally different jobs;
        - The developer's job is to implement it as good as possible according to the project requirements. Because if he asks all the WHYs about everything, we never get any code ready. He's job is to deliver on time and on budget;

## An archutecture must
- Describe why technology decisions were made
    - Connects requirement to design choices
- Describe HOW it is used
    - Description of technology usage
    - Include coding patterns and/or prototype information
- Describe the governance and usage
    - EA integration
    - Governance information
    - Architecture analysis

## Issues due to lack of architecture
- Big ball of mud
- Spaghetti code
- Inconsistent approaches to solving same problems
- Quality attributes ignored
- Deployment problems
- Maintenance issues

## Important questions
### General questions
- How do I design effectively and minimally?

### Business related questions
- Is the ROI real?
- Are the components strategic?
- Can they be used to make money?
- How does this impact the overall deployment topology?
- What else is being built?
- Can the organization handle it?
- Will the organization accept it?
- Is it just reliable enough? Secure enough? usable enough?

### Technical questions
- Does the picture reflect what we want to build?
- Is it going to work?
- Have you identified and mitigated the highest priority risks?

---

## Definitions
- Software design: Looks at the lower-level aspects of a system;
- Software architecture: Looks at the higher-level aspects of a system;
- Functional requirements: What the system is expected to do;
- Non-Functional requirements: How well the system does what it does.
- Programming paradigm: The way a program is written;
    - Imperative paradigm: Breaks large operations into smaller programs called subroutines (like methods)




## Principles
- Simplicity first! Make knowledge transfering low;

## Observations
- Try playing with people much better than you;
- Architecture represents significant decisions, where significance is measured by cost of change;
    - Significant decisions:
        - Architecture (Programming language, architecture style)
        - Design
        - Implementation (Indenting tabs)
- Base your architecture on requirements, travel light and prove your architecture with concrete experiments (Poc, prototype, spike, tracer, vertical slice, walking skeleton, executable reference architecture, etc);
- Components responsabilities are often described as verbs. E.g., search;
- As an architect stablish what quality attributes are negotiable and the ones that must be done;
- We can invest in anything as long as we measure the value we received in some fashion;

## Content

## Object-Oriented Analysis and Design
### Eliciting Requirements (Design Process)
The phase to clarify requirements that the client did not tell.

This activity involves producing a *Conceptual Design* and a *Technical Design*, that results in two artifacts: *Conceptual Mockups* and *Technical Diagrams*;

During the conceptual design we talk about:
- Mockups
- Requirements
- Tradeoffs

Conceptual Mockups provide initial thoughts on how the requirements will be satisfied;

- Identify major components and connections;
    - Each component has a task it needs to perform. It is a responsability;
- Work on the Technical Design, that describes how these responsabilities are met; This is done by splitting the components into smaller components;

### Object-oriented thinking
User story: As an online shopper, I want to add an item to my shopping cart, so that I can purchase it.

Objects:
- User;
- Item;
- Shopping cart;

Behaviours:
- Add;
- Purchase;

Connections:
- User and shopping cart;
- User and items;
- Shopping cart and items;


#### Object categories
- Entity Objects: Real world entity;
- Boundary Objects: Sit at the boundary between systems;
- Control Objects: Responsible for coordination;

#### Quality attributes
##### Competing qualities (Quality vs Time to market)
- Usability
- Scalability
- Performance
- Convenience
- Security
- Reusability
- Flexibility
- Maintainability

Always validate the project quality

Tradeoffs
- Performance vs Security
- Performance vs Maintenability
- Performance vs Backwards compatibility

Context is important what choice of solution is right for the quality of the balance;

#### Class Responsability Collaborator (CRC)
To represent components, connections and responsabilities in the *Conceptual Design* phase we use CRC cards;

Good for prototyping and simulating high level design;

CRC cards are used to Identify, Organize and Refine the components in the conceptual design;

CRC Structure:
- Class name (Component name);
- Responsabilities;
- Collaborators: Other classes the class interacts with (connects to) to fulfill its responsabilities;

### Creating models in design
#### Design principles
Design principles lead to software that is Flexible, Reusable and Maintainable;

The goal of Object-oriented design is to:
- Make an abstract data type easier to write;
- Structure a system around abstract data types called classes;
- Introduce the ability for an abstract data type to extend another by inheritance;

#### Four design principles
- Abstraction: Simplifying a concept to its essentials within some context. Ignoring unimporrtant details;
    - They have definitions of what attributes or responsabilities the subject should have. Not implementations;
- Encapsulation: Self-contained object with data and functions it requires to work. Exposes an interface that other objects can access and use it, and restricts access to certain inside details;
    - Black box thinking (Abstraction barrier): The other classes do not need to know how certain method is implemented. Just its result;
- Decomposition: Taking a whole thing and dividing it into parts. On the flip side, taking a bunch of separate parts with different functinalities and combining them to form a whole;
    - It is important to understand how the parts relate to the whole, considering:
        - Fixed or dynamic number;
        - Lifetime: Does it exists independently?
        - Sharing: Does the part performs different roles in different wholes? Do we want it to be possible?
    - Types of decomposition (They define the interaction between the whole and the parts)`:
        - Association: Interaction between two independent objects;
            - UML connection: Straight line;
            - Example: Car - passengers
        - Aggregation: "Has-a" relationship. The whole has a part that belongs to it. These parts can be shared among other wholes. The relationship is weak since the parts can exist independently;
            - UML connection: Empty diamond in the whole side;
            - Example: Bookshelf - books
        - Composition: Exclusive containment of parts. A strong Has-a relationship. The whole cannot exist without parts. If it loses any of its parts the whole ceases to exist. If the whole is destroyed then all of its parts are destroyed too.
            - Usually we can only access parts through its whole;
            - The parts are exclusive to the whole;
            - UML connection: Fulfilled diamond in the whole side;
            - Example: House - Room
- Generalization: Factorying repeated, common and shared characteristics into one class;
    - Allows us to apply DRY;
    - Achieved by inheritance;
    - Helps to reduce the amount of redundancy when resolving problems;

### Expressing design structure with UML
#### Generalization with Inheritance

- Represented by a solid line
- Superclass (Generalized classes) at the head of the arrow
- Subclass (Specialized classes) at the tail

Protected attributes can only be accessed by:
- Encapsulating class itself;
- All subclasses;
- All classes within the same package (namespace that represents those classes);

Explicit constructors allows us to assign values to attributes during instantiation;

#### Generalization with Interfaces
- An interface is a contract to be fulfilled by implementing classes;
- Interfaces are not generalization of classes. Just used to describe behaviours, not attributes;
- The UML notation for interface implementation by a class is a dotted arrow.
    - Interface touches the head of the arrow;
    - Class touches the tail of the arrow;


#### Classes relationships
- Dependency: Class A uses class B. But class A does not contain an instance of B as part of its own state.
    - UML notation: dashed open arrow
- Association: A stronger dependency relationship. It is a one-way relationship. Class A contains an instance of B. But B does not know about A.
    - UML notation: solid open arrow
- Generalization: Inheritance
    - UML notation: solid closed arrow
- Realization: Interface (contract) implementation
    - UML notation: dashed closed arrow

---
## Sequence Diagrams
Show how the objects interact with each other to complete tasks;
### Components
- Actor
- Objects (:Name of the class)
- Lifelines (dashed vertical lines)
- Messages (solid arrows)
    - Response (dashed arrow)

### Alternative process
- When this alternative will occur
    - Example: [ Tv viewer knows what channel they want ]
- [ else ] process
- loop
    - Example: [ Tv viewer does not like the channel ]

## Design Principles
### General guidelines to evaluate the structure of your software solution
- Flexibility
- Reusability
- Maintainability

#### Evaluating design complexity
Well designed systems are like lego blocks where we can connect two blocks without much trouble.

Bad designed systems are like puzzles where we can only connect pieces to other specifics puzzle pieces and nothing else.

- Module: Class and methods inside it
- Metrics for evaluating complexity:
    - Coupling: Complexity between the module and other modules;
        - When evaluating the coupling of a module we consider:
            - Degree: Number of connections between the modules and others;
                - Keep it small. Connection through few parameters or narrow interfaces;
            - Ease: How obvious are the connections between the module and others. We want the connections to be easy to make without needing to understand the implementations of the other modules;
            - Flexibility: How interchangeable the other modules are for this module. We want to be able to replace the module for something else better in the future;
    - Cohesion: Complexity within a module. It represents the clarity of responsabilities within a module;
        - High cohesion: One clear purpose;
        - Low cohesion: If the module encapsulates more than one purpose or has an unclear purpose;

#### Principles to achieve Flexibility, Reusability and Maintainability
- Design principles questions:
    - What attributes and behaviours do we need to model a class through abstraction?
    - How are these attributes and behaviours grouped together and accessed through encapsulation?
    - Can my class be simplified into smaller parts using decomposition?
    - Are there common things among my objects that can be generalized?
- Separation of concerns
    - Some concerns can lead to more concerns so we have to consider:
        - What information the implementation represents;
        - What it manipulates;
        - What gets presented at the end;

#### Information Hiding
- need-to-know;
- Modules only have to have access to the information needed to perform their task;
- Parts that might change should be hidden. E.g., Implementation details;
- Parts that should not change are revealed through interfaces;

#### Conceptual Integrity
- It is about designing and implementing a software in a consistent manner. As if it was written by one person;
- To achieve this we should have a well defined design and architecture;
- Decisions on how the system will be designed and implemented;

### Generalization Principles
Use when subclasses provide and share attributes and behaviors from the same superclass, but each subclass has their own distinct functions.

How to know if we are abusing inheritance? Ask:
- Am I using inheritance to simply share attributes or behavior without further adding anything special in my subclasses? Yes = Abusing
- Am I breaking Liskov Substitution Principle? Yes = Abusing
    - It states that a subclass can replace a superclass, if and only if, the subclass does not change the functionallity of a superclass;

### Modeling Behaviour
#### UML Sequence diagram
Describes how objects in a system interact to complite a specific task.

Should be represented from left to right in the order they interact with each other.

Components:
- Actor (starts the entire process)
- Labeled box
- Lifeline
- Messages (solid line from sender to receiver)
    - Response (return of control) (dashed line)
- Activation

#### UML State diagram

It describes how the system, components or objects behave and respond when events occur.

- State: A way an object exists at a particular point in time. The state of an object is determined by the values of its attributes;
    - It has three sections:
        - State name (Required)
            - E.g., Full
        - State variables: Data relevant to the state of the object;
            - E.g., Students (in a course context)
        - Activities
            - Actions that are performed when in a certain state;
                - Types of activities:
                    - Entry: When entered from another state;
                    - Do: Occur once or multiple times while in a certain state;
                    - Exit: When state is exited and moves on to another state;
- Transition: Events that change states
    - UML Notation: Solid line fulfilled arrow from one state to another;
    - Each transition will always have an event and may have a guard condition, and an action;
    - E.g.: 
        - Event: Click submit button.
        - Guard condition: Submit date before due date. 
        - Action: Submit test
- Termination: An object being destroyed or the process being completed;
    - UML notation: Circle with a filled circle inside;

### Model Checking

This should be done after coding and before deploying;

It is a technique that does state exploration;
E.g.: Given that you started in this current state, explore all the ways you can go into the future and reason about what all those future states can look like.

Model checkers generate a state model from code;
State model: Abstract state machine that can be in one of various states. The model checker then checks that state model conforms to certain behavioral properties; 

Phases to perform model checking:
- Modeling phase: Here we enter the model description and desired properties.
    - Here we can verify sanity checks
    - E.g., Turning on and off a light bulb switcher
- Running phase: Run the model checker to see if our model conforms with the desired properties wrote in the modeling phase;
- Analysis phase: Check if all the properties were satisfied or violated (counterexamples)

Semantics

How do we improve our ability to reason about software using states?

---

## Design patterns

It is a pratical proven solution to a recurring design problem;

### Gang of four

There are 23 patterns in this catalog

#### Categories
##### Creational Patterns (How we create new objects)

We can create or clone objects;

- Singleton Pattern
    - Design goal: Only one object of a class that is globally accessible;
    - Example: App settings, print queue, software driver for a device;
    - Implementation prerequisites:
        - Private constructor
        - Private class variable that references the one object of the class;
        - Public static method to get the class variable. Instantiate if not exist;
    - Lazy creation: Does not create an object until it is truly needed;
    - If there are multiple threads running, there could be issues caused by the threads trying to access the shared single object;

- Factory Method Pattern
    - Design goal: Defines an interface for creating objects, but let the subclasses decide which class to instantiate;
    - Factories allow client code to operate on generalizations; I.e., Coding to an interface, not an implementation;
    - Concrete instantiation: Instantiate a class based on a provided type;
        - E.g., new Product product;
    - Factory Object: Object that creates other objects; Could be useful if many parts of the software want to create the same objects;
    - Factory Method (Abstract class): Object creation is made by other method. Now instead of using the factory object, we specialize into the class that will use the factory method;

##### Structural Patterns (How objects are connected to each other)
- Also specify how subclasses and classes interact through inheritance;
- Facade Pattern
    - Design Goal: Provides a single simplified interface for client classes to interact with the system;
        - It is a wrapper class that encapsulates a subsystem in order to hide its complexity (by information hiding design principle);
    - Does NOT add functionallity;
    - Acts as an point of entry into the subsystem;
    - A Facade class can be used to wrap all the interfaces and classes for a subsystem. So it is our decision to decide what we want to wrap;
    - Steps:
        - Design the interface that will be implemented by the different classes;
        - Implement the interface with one or more classes;
        - Create the Facade class and wrap the classes that implement the interface;
        - Use the Facade class to access the subsystem;
    - While the facade design pattern uses a number of different design principles, its purpose is to provide ease of access to a complex subsystem. This is done by encapsulating the subsystem classes into a Facade class, and then hiding them from the client classes so that the clients do not know about the details of the subsystem. 
- Adapter Pattern
    - Design Goal: Solve situations where the output of one system may not conform to the expected input of another system;
    - The adaptee is hidden from the client by the wrapping adapter class;
    - An adapter is meant to:

        - An adapter is meant to wrap the adaptee and expose a target interface to the client;
        - Indirectly change the adaptee's interface into one that the client is expecting by implementing a target interface;
        - Indirectly translate the client's request into one the ad`aptee is expecting;
        - Reuse an existing adaptee with an incompatible interface;
    - Steps:
        - Design the target interface;
        - Implement the target interface with the adapter class;
        - Send the request from the client to the adapter using the target interface;
- Composite Pattern
    - Design Goal: Compose nested structures of objects and deal with the classes for these objects uniformly;
    - Solves:
        - How do we use individual types of objects to build a tree-like structure?
        - How do we treat individual objects uniformly without checking their types?
            - This is achieved by:
                - Enforcing polymorphism across each class implementing an interface (or inheriting from a superclass)
                - Using a technique called `Recursive Composition`, which allows objects to be composed of other objects that are of a common type;
    - Steps:
        - Design the interface that defines the overall type;
        - Implement the composite class;
        - Implement the leaf class (Does not contain any components within);

- Proxy Pattern
    - Design Goal: A Proxy class represents a real subject class;
        - Scenarios to use proxy pattern:
            - Act as a virtual proxy: For heavy tasks. We use a lightweight proxy in place of a resource intensive object until it is actually needed;
            - Act as a protection proxy: Check permissions;
            - Act as a remote proxy: The proxy class is local and the real subject is remote;
                - Implementation of a verification of requests from client in order to determine if, how, and to whom the requests should be forwarded to;
    - Steps:
        - Design the subject interface (this will be implemented by the proxy and the real subject;
        - Implement the interface in the real subject class;
        - Implement the proxy class;

- Decorator Pattern
    - Design Goal: Allows objects to dynamically add behaviors to others and reduce the number of classes needed to offer a combination of behaviors.
    - Aggregate other types of components, which will allow us to "stack" components on top of each other;
    - Makes use of interfaces and inheritance;
    - Steps:
        - Design the component interface (defines the common behavior the concrete component and concrete decorators will have;
        - Implement the interface with the base concrete component class;
            - This should be the FIRST ONE in the stack;
        - Implement the interface with the abstract decorator class;
            - It contains only ONE instance (aggregation) of the interface implementation class;
        - Inherit from the abstract decorator and implement the component interface with concrete decorator classes;


##### Behavioral Patterns (How objects collaborate to achieve a common goal)
- How each object does a single cohesive function, and also how independent objects work towards a common goal;

- Template Method Pattern
    - Design Goal: Define the skeleton of an algorithm in an operation, letting the subclasses redefine certain steps without changint the algorithm's structure;
    - Useful when we have two classes with same functionality, in the same sequence, but different implementations;

- Chain of responsibility
    - Design Goal: Pass requests to the next handler so one of them can successfully handle it; If no handler can resolve the request then it will no be satisfied;
    - Steps in the concrete handler:
        - Check if the rule matches
        - If it matches, do something specific;
        - If doesn't match, call the next filter in the list;
    - It can be combined with the `Template Pattern` so we can ensure each handler will handle the request in a similar way, following the required steps;