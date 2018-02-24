# software-architecture-specialization

## Definitions
- Software design: Looks at the lower-level aspects of a system;
- Software architecture: Looks at the higher-level aspects of a system;

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
### Eliciting Requirements
The phase to clarify requirements that the client did not tell.

This activity involves producing a *Conceptual Design* and a *Technical Design*, that results in two artifacts: *Conceptual Mockups* and *Technical Diagrams*;

Conceptual Mockups provide initial thoughts on how the requirements will be satisfied;

- Identify major components and connections;
    - Each component has a task it needs to perform. It is a responsability;
- Work on the Technical Design, that describes how these responsabilities are met; This is done by splitting the components into smaller components;

#### Object-oriented thinking
As an online shopper, I want to add an item to my shopping cart, so that I can purchase it.

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