build:
	mvn compile test-compile

scan:
	mvn jqassistant:scan

analyze:
	mvn jqassistant:analyze

server:
	mvn jqassistant:server

adoc: build scan analyze

report: build scan analyze
	mvn jqassistant:report

open-adoc:
	open target/jqassistant/report/asciidoc/index.html

open-report:
	open target/site/jqassistant.html
