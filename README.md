Quarkus Architecture Testing Showcase
----
This project holds examples for different types of architecture testing.

Frameworks
----
- [ArchUnit](https://www.archunit.org)
- [jqAssistant](https://jqassistant.org)

Architecture Decision Records
----
Since jqAssistant can render asciidoc, it is also possible to include real
tests and other queries inside of valid [ADR](https://adr.github.io/).

Instructions
----
Following make targets exist:

- **build** - Build project and tests
- **scan** - Run the jqAssistant scanner
- **analyze** - Run the jqAssistant analyzer
- **adoc** - Generate asciidoc
- **open-adoc** - Open the generated asciidoc in your browser
- **report** - Generate report  
- **open-report** - Open the generated report in your browser
- **server** - Starts the Neo4J server + web frontend
