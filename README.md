<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
css
Copy code
    h1 {
        text-align: center;
    }

    h2 {
        margin-top: 30px;
    }

    p {
        margin-bottom: 15px;
    }

    .pattern-section {
        margin-top: 40px;
    }

    .pattern-title {
        margin-top: 20px;
        font-weight: bold;
    }

    .pattern-description {
        margin-top: 10px;
    }

    .uml-image {
        text-align: center;
        margin-top: 20px;
    }
</style>
</head>
<body>
    <h1>Design Patterns Project</h1>
php
Copy code
<div class="pattern-section">
    <h2>Abstract Factory Pattern</h2>
    <p>
        To avoid specifying concrete object subclasses from a family, we used the AbstractFactory pattern. The
        first thing it suggests is to explicitly declare interfaces for each distinct product of the product family.
        All variants of cheesecake (ClassicCheesecake, ChocolateCheesecake, MangoCheesecake) implement the
        Cheesecake interface. The next move is to create a list of creation methods for all products that are part of
        the product family (createCheesecake).
    </p>
    <div class="uml-image">
        <!-- Add UML image for Abstract Factory Pattern here -->
        <!-- <img src="abstract_factory_pattern_uml.png" alt="Abstract Factory Pattern UML"> -->
    </div>
</div>

<div class="pattern-section">
    <h2>Prototype Pattern</h2>
    <p>
        If someone wants the same products as you, we use the Prototype design pattern to clone an existing object
        (command) instead of creating a new one. Any class that implements the Prototype interface should
        implement the clone() method, and thus the object can be cloned.
    </p>
    <div class="uml-image">
        <!-- Add UML image for Prototype Pattern here -->
        <!-- <img src="prototype_pattern_uml.png" alt="Prototype Pattern UML"> -->
    </div>
</div>

<div class="pattern-section">
    <h2>Builder Pattern</h2>
    <p>
        The Builder pattern allows you to create different representations of a complex object using the same
        construction process. In this case, you can choose between a line or grid menu template and also select
        whether you want to dine in or take it home.
    </p>
    <div class="uml-image">
        <!-- Add UML image for Builder Pattern here -->
        <!-- <img src="builder_pattern_uml.png" alt="Builder Pattern UML"> -->
    </div>
</div>

<div class="pattern-section">
    <h2>Decorator Pattern</h2>
    <p>
        The Decorator pattern allows you to add additional behavior to an object dynamically. In the provided code,
        the Decorator pattern is used to decorate the BakeryMenu component with additional functionalities for
        different cheesecake flavors.
    </p>
    <div class="uml-image">
        <!-- Add UML image for Decorator Pattern here -->
        <!-- <img src="decorator_pattern_uml.png" alt="Decorator Pattern UML"> -->
    </div>
</div>

<div class="pattern-section">
    <h2>Facade Pattern</h2>
    <p>
        The Facade pattern provides a simplified interface for a complex subsystem. In this case, the MenuKeeper
        acts as a facade that simplifies interactions with different cheesecake flavors (subsystem classes).
    </p>
    <div class="uml-image">
        <!-- Add UML image for Facade Pattern here -->
        <!-- <img src="facade_pattern_uml.png" alt="Facade Pattern UML"> -->
    </div>
</div>

<div class="pattern-section">
    <h2>Template Method Pattern</h2>
    <p>
        The Template Method pattern defines the skeleton of an algorithm in a base class, with specific steps that
        can be implemented by subclasses. The provided code demonstrates the usage of this pattern in menu
        template classes.
    </p>
    <div class="uml-image">
        <!-- Add UML image for Template Method Pattern here -->
        <!-- <img src="template_method_pattern_uml.png" alt="Template Method Pattern UML"> -->
    </div>
</div>
</body>
</html>