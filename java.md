# EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Create a `.gitignore` file so generated files won't be committed
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up

# Tasks
## 1-3. Complete the following tasks: (~90 mins)
- [Uniques Characters](src/UniqueChars.java)
- [Favourite Animals](src/FavouriteAnimals.java)
- [Candy Shop](src/TakeMeToThe.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 4. Question time! (~10 mins) [4p]

###  What is the difference between a function and a method? [2p]
#### Your answer:

**Functions** are defined code blocks that have unique name, can take parameters and will run the code
what is inside when called from elsewhere. They may or may not return data, as needed.
**Methods** are functions of objects, connected to them, can be interpreted only in the context of the
object itself. The default parameter of these special functions is the object itself, from they are called.
Since Java is a heavily object oriented language, it has no functions, only methods. In Java, basically
everything is an object, except primitive data types but these don't need functions, they can only understand operators.

### What is the constructor? When it is used? [2p]
#### Your answer:

When you need to create an object, first, you create a class. It is only the plan (or the blueprint :-) ) of the object.
If you want to use such an object, you need to create - instantiate - one first. The **constructor** is a default special
method which does exactly this. It creates an instance of the object. If the object has field variables, you can set
default values for these in the constructor. Also, you can add more fields to the object if it is needed.