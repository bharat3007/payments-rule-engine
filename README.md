# payments-rule-engine


This engine should be able to process orders with the following rules
* If the payment is for a physical product, generate a packing slip for shipping.
* If the payment is for a book, create a duplicate packing slip for the royalty department.
* If the payment is for a membership, activate that membership.
* If the payment is an upgrade to a membership, apply the upgrade.
* If the payment is for a membership or upgrade, e-mail the owner and inform them of the activation/upgrade.
* If the payment is for the video “Learning to Ski,” add a free “First Aid” video to the packing slip (the result of a court decision in 1997). • If the payment is for a physical product or a book, generate a commission payment to the agent.

This is a sample java app, the project is setup to compile classes with Maven. Unit tests can be run using mvn test which asserts that all tests run successfully. The design is as follows. There is a generic Product class. Specific products inherit from that product class. The products all override the default  method with actions appropriate for the individual product as described above.
Unit tests assert that the rules are followed.


 

