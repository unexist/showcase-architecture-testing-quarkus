scan:
	mvn jqassistant:scan

analyze:
	mvn jqassistant:analyze

run: scan analyze

server: run
	mvn jqassistant:server

open:
	open target/jqassistant/report/asciidoc/index.html