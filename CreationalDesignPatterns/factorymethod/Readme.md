Product Interface (Weapon): This is the common interface for all objects that the factory method creates.
Concrete Products (Spear, Axe): These are the classes that implement the Weapon interface.
Creator Interface (Blacksmith): This interface declares the factory method.
Concrete Creators (ElfBlacksmith, OrcBlacksmith): These classes implement the factory method to create specific types of objects.
Client (Main): This is the code that uses the factory method to create objects without knowing the exact class of object that will be created.

Class Diagram:

        +----------------+
        |    Weapon      |
        +----------------+
        | + getType()    |
        +----------------+
               ^
               |
        +-----------------+
        | Spear           |
        +-----------------+
        | + getType()     |
        +-----------------+
               ^
               |
        +-----------------+
        | Axe             |
        +-----------------+
        | + getType()     |
        +-----------------+
               ^
               |
        +-----------------+
        | Blacksmith      |
        +-----------------+
        | + manufactureWeapon(weaponType)|
        +-----------------+
               ^
               |
        +-----------------+
        | ElfBlacksmith   |
        +-----------------+
        | + manufactureWeapon(weaponType)|
        +-----------------+
               ^
               |
        +-----------------+
        | OrcBlacksmith   |
        +-----------------+
        | + manufactureWeapon(weaponType)|
        +-----------------+

Applicability
Use the Factory Method pattern when:

A class cannot anticipate the class of objects it must create.
A class wants its subclasses to specify the objects it creates.
Classes delegate responsibility to one of several helper subclasses.
Known Uses
java.util.Calendar
java.util.ResourceBundle
java.text.NumberFormat
java.nio.charset.Charset
java.net.URLStreamHandlerFactory
java.util.EnumSet
javax.xml.bind.JAXBContext
Consequences
Benefits:

Provides hooks for subclasses, creating flexibility in code.
Connects parallel class hierarchies.
Eliminates the need to bind application-specific classes into the code.
Trade-offs:

Can complicate the code by requiring the addition of new subclasses to implement the extended factory methods.