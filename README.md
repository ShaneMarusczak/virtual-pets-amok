Virtual Pets AMOK! readme

I started writing my program with tests to get me off the ground. I find that tests are very usefull when no code at all has been written.

I included all necessary methods and variables to allow this program to create cats and dogs, both robotic and organic.

I created abstract classes, Robotic and Organic, to house the differnt methods and variables that each type of pet has. This allowed me to prevent the oiling of organic pets and the feeding of robotic pets.

Also, in the shelter class I used for loops and if statements so that each method called in the app would only affect the desired type of pet. So if I went to feed all organic pets, that is what would happen. It would not spill over into the robotic pets.

The app implements a game loop and a do while statement to create menus and it allows you to keep playing until you decide to stop. The app only communicates with the shelter class, and the shelter class then communicates with the pet classes. The app never interacts directly with a pet.

Also, I used an interface to group the dogs going for a walk together. That was the only place I could see interfaces being of value, no other separate classes shared methods that were not already covered in abstract classes they inherited from.

