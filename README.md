# business-rules-engine

[Book: Real-World Software Development](https://learning.oreilly.com/library/view/real-world-software-development/9781491967164/)

## Challenge

In order to encourage collaboration between the business team and the tech team, you’ve decided that you will develop a Business Rules Engine that will enable developers and the business team to write code together. This will allow you to increase productivity and reduce the time it takes to implement new rules because your business team will be able to contribute directly.

## Requirements

You’d like to enable nonprogrammers to add or change business logic in their own workflow. For example, a marketing executive may wish to apply a special discount when a prospect is making an inquiry about one of your products and fits certain criteria. An accounting executive may wish to create an alert if expenses are unusually high. These are examples of what you can achieve with a Business Rules Engine. It’s essentially software that executes one or more business rules that are often declared using a simple bespoke language. A Business Rules Engine can support multiple different components:

- Facts: The available information to which rules have access.
- Actions: The operation you want to perform.
- Conditions: These specify when an action should be triggered.
- Rules: These specify the business logic you want to execute, essentially grouping facts, conditions, and actions together. A rule is a condition and an action together.

The main productivity benefit of a Business Rules Engine is that it enables rules to be maintained, executed, and tested within one place without having to integrate with a main application.

(There are many production-ready Java Business Rules Engine such as Drools. Typically such an engine conforms to standards such as the Decision Model and Notation (DMN) and comes with a centralized rule repository, an editor using a Graphical User Interface (GUI), and visualization tools to help maintenance of complex rules.)