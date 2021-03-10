scan:
	mvn jqassistant:scan

analyze:
	mvn jqassistant:analyze

server:
	mvn jqassistant:server

docs: scan analyze

open:
	open target/jqassistant/report/asciidoc/index.html