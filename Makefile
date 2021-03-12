scan:
	mvn jqassistant:scan

analyze:
	mvn jqassistant:analyze

server:
	mvn jqassistant:server

adoc: scan analyze

report: scan analyze
	mvn jqassistant:report

open-adoc:
	open target/jqassistant/report/asciidoc/index.html

open-report:
	open target/site/jqassistant.html
