# software-architecture-specialization

## Definitions
- Software design: Looks at the lower-level aspects of a system;
- Software architecture: Looks at the higher-level aspects of a system;
- Functional requirements: What the system is expected to do;
- Non-Functional requirements: How well the system does what it does.
- Programming paradigm: The way a program is written;
    - Imperative paradigm: Breaks large operations into smaller programs called subroutines (like methods)
    - 


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

## Issues due to lack of architecture
- Big ball of mud
- Spaghetti code
- Inconsistent approaches to solving same problems
- Quality attributes ignored
- Deployment problems
- Maintenance issues

## Important questions
- Does the picture reflect what we want to build?
- Is it going to work?
- Have you identified and mitigated the highest priority risks?

## Content
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

#### Object-oriented thinking
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

CRC cards are used to Record, Organize and Refine the components in the conceptual design;

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
- Decomposition
- Generalization