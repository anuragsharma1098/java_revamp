# Java Revamp - Complete Java Learning Repository

A comprehensive Java learning and practice repository covering fundamental Java concepts through advanced Object-Oriented Programming (OOP) principles. This project is structured as a 6-day intensive learning path with additional modules for common algorithmic problems and Java collections.

## 📋 Table of Contents

- [Project Overview](#project-overview)
- [Prerequisites & Installation](#prerequisites--installation)
- [Project Structure](#project-structure)
- [Module Descriptions](#module-descriptions)
- [How to Compile & Run](#how-to-compile--run)
- [Topics Covered](#topics-covered)
- [Directory Guide](#directory-guide)

---

## 🎯 Project Overview

This repository serves as a hands-on guide to learning Java from basics to intermediate concepts. It includes:

- **Day 1-6 Java Revamp**: Structured learning path with daily topics
- **Collections**: ArrayList, HashMap, HashSet implementations
- **Exception Handling**: Checked/unchecked exceptions with real examples
- **Interfaces**: Interface design patterns and implementations
- **Problem Solving**: Common algorithmic problems (Prime, Fibonacci, Palindrome, etc.)
- **Type System**: Type casting and conversion examples
- **Wrapper Classes**: Working with Java wrapper classes

---

## 📦 Prerequisites & Installation

### Step 1: Install Java Development Kit (JDK)

#### **Option A: Download from Oracle (Windows/Mac/Linux)**

1. Visit [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/)
2. Download JDK 11 or later (LTS versions recommended: 11, 17, or 21)
3. Run the installer and follow the installation wizard
4. Accept the license agreement and choose your installation directory

#### **Option B: Using Package Managers**

**Windows (Chocolatey):**
```powershell
choco install openjdk
```

**macOS (Homebrew):**
```bash
brew install openjdk
```

**Ubuntu/Debian:**
```bash
sudo apt-get update
sudo apt-get install openjdk-11-jdk
```

### Step 2: Verify Java Installation

```bash
java -version
javac -version
```

You should see output like:
```
java version "11.0.12" 2021-07-20 LTS
Java(TM) SE Runtime Environment 18.9
Java HotSpot(TM) 64-Bit Server VM 11.0.12
```

### Step 3: Set JAVA_HOME Environment Variable

#### **Windows:**
1. Open System Properties (Advanced tab)
2. Click "Environment Variables"
3. Create a new system variable:
   - **Variable name**: `JAVA_HOME`
   - **Variable value**: `C:\Program Files\Java\jdk-11` (or your installation path)
4. Click OK and restart your IDE

#### **macOS/Linux:**
```bash
export JAVA_HOME=$(/usr/libexec/java_home -v 11)
echo $JAVA_HOME
```

### Step 4: Clone or Download the Repository

```bash
git clone https://github.com/anuragsharma1098/java_revamp.git
cd java_revamp
```

---

## 📁 Project Structure

```
java_revamp/
├── README.md                          # This file
├── java_revmp/
│   ├── src/                          # All Java source files
│   │   ├── module-info.java          # Java module descriptor
│   │   ├── collectionss/             # Collections examples
│   │   ├── exception_handling/       # Exception handling demos
│   │   ├── interfacee/               # Interface implementations
│   │   ├── java_ques/                # Algorithmic problems
│   │   ├── java_revamp/              # 6-day learning curriculum
│   │   ├── type_casting/             # Type conversion examples
│   │   └── wrapperclass/             # Wrapper class demos
│   └── bin/                          # Compiled .class files (auto-generated)
├── Java_Revamp.pdf                   # Additional documentation
└── git-cheat-sheet-education.pdf    # Git reference guide
```

---

## 📚 Module Descriptions

### 1. **java_revamp/** - Structured 6-Day Learning Path

#### **Day 1: Java Basics**
- **File**: `day_1/TestApp_1.java`
- **Topics**:
  - Java syntax and structure
  - Primitive data types (byte, short, int, long, float, double)
  - Console output with `System.out.println()`
  - Running your first Java program

#### **Day 2: Input, Type Conversion & Wrapper Classes**
- **Files**:
  - `day_2/ScanFunction_2.java` - User input with Scanner
  - `day_2/TypeCasting_2.java` - Explicit type casting
  - `day_2/TypeConversion_2.java` - Implicit/explicit conversions
  - `day_2/WrapperClass_2.java` - Integer, String, Boolean wrappers
  - `day_2/SummOfNumbers_2.java` - Practical example

- **Topics**:
  - Scanner for user input
  - Type casting (narrowing & widening)
  - Wrapper classes (Integer, Double, Boolean, String)
  - Autoboxing & unboxing

#### **Day 3: Arrays & Strings**
- **Files**:
  - `day_3/Array_3.java` - 1D arrays
  - `day_3/TwoDimnArray_3.java` - 2D arrays
  - `day_3/JaggedArray_3.java` - Jagged arrays (irregular 2D)
  - `day_3/Strings_3.java` - String operations and methods
  - `day_3/StringCRUD_3.java` - String manipulation
  - `day_3/ArrayClass_3.java` - Array class utilities

- **Topics**:
  - Array declaration, initialization, and traversal
  - Multi-dimensional arrays
  - String immutability, concatenation, methods
  - Working with StringBuilder and StringBuffer

#### **Day 4-5: Object-Oriented Programming (OOP)**
- **Files**:
  - `day_4_5/oops_4.java` - OOP fundamentals
  - `day_4_5/oops_4_CRUD.java` - CRUD operations with classes
  - `day_4_5/oops_4_CRUD_todo_entity.java` - Entity class example
  - `day_4_5/oops_5.java` - OOP concepts
  - `day_4_5/oops_5_class.java` - Class design
  - `day_4_5/oops_5_implnts.java` - Implementation patterns
  - `day_4_5/oops_5_polymorphism.java` - Polymorphism demo
  - `day_4_5/oops_5_main_overloading.java` - Method overloading
  - `day_4_5/oops_5_class_int_imp.java` - Class & interface integration
  - `day_4_5/oops_5_user.java` & `oops_5_user_dao.java` - Real-world example

- **Topics**:
  - Classes and objects
  - Constructors and initialization
  - Encapsulation (getters/setters)
  - Method overloading
  - Instance and static members
  - CRUD operations pattern
  - Data Access Objects (DAO)

#### **Day 6: Inheritance & Advanced OOP**
- **Files**:
  - `day_6/single_multilevel_inheritance.java` - Single and multilevel inheritance
  - `day_6/multiple_inheritance.java` - Multiple inheritance via interfaces
  - `day_6/hierarchy_inheritance.java` - Hierarchical inheritance
  - `day_6/super_class.java` - Using `super` keyword
  - `day_6/thiskeyword.java` - Using `this` keyword
  - `day_6/staticc.java` - Static variables and methods
  - `day_6/finalkeyword.java` - Final classes and methods
  - `day_6/interface_implement.java` - Interface implementation

- **Topics**:
  - Inheritance types (single, multiple, hierarchical, multilevel)
  - `super` and `this` keywords
  - Method overriding
  - `final` keyword (for classes, methods, variables)
  - `static` members and initialization blocks
  - Interface implementation as alternative to multiple inheritance

### 2. **collectionss/** - Java Collections Framework

- **Files**:
  - `arraylist_demo.java` - Dynamic array implementation
  - `hashmap_demo.java` - Key-value pair storage
  - `hashset_demo.java` - Unique element storage

- **Topics**:
  - ArrayList (generic and non-generic)
  - HashMap (key-value mapping)
  - HashSet (unique elements)
  - Iterating collections
  - Generic types
  - Collection methods

### 3. **exception_handling/** - Exception Management

- **Files**:
  - `except.java` - Basic try-catch-finally
  - `exception_demo.java` - Exception demonstrations
  - `chked_exception.java` - Checked exceptions
  - `throws_exception.java` - Throws clause usage

- **Topics**:
  - Try-catch-finally blocks
  - Checked vs unchecked exceptions
  - Custom exception handling
  - Exception propagation
  - Resource management

### 4. **interfacee/** - Interface Design Patterns

- **Files**:
  - `i1.java` & `i2.java` - Interface declarations
  - `c1.java` & `c2.java` - Implementation classes
  - `interface_demo.java` - Usage demonstration

- **Topics**:
  - Interface declaration and implementation
  - Abstract methods
  - Multiple interface implementation
  - Polymorphism through interfaces
  - Interface as contract

### 5. **java_ques/** - Algorithmic Problem Solving

Common Java algorithms and mathematical problems:

| Problem | File | Description |
|---------|------|-------------|
| Prime Number | `Prime.java` | Check if a number is prime |
| Fibonacci | `Fibonacci.java` | Generate Fibonacci sequence |
| Factorial | `Factorial.java` | Calculate factorial |
| Palindrome | `palindrome.java` | Check if number/string is palindrome |
| Armstrong | `armstrong.java` | Check Armstrong/narcissistic numbers |
| GCD & LCM | `gcd_lcd.java` | Greatest common divisor & least common multiple |
| Digit Count | `digit_count.java` | Count digits in a number |
| Sum of Digits | `sumofdigits.java` | Add all digits together |
| Reverse Number | `reverse_num.java` | Reverse integer digits |
| Largest/Smallest | `largest_smallest.java` | Find extremes in array |
| Odd/Even | `OddEven.java` | Classify numbers |
| Sort Digits | `sortdigits.java` | Sort digits in number |
| Swap Numbers | `Swap_num.java` | Swap two numbers |

### 6. **type_casting/** - Type System Examples

- **Files**:
  - `type_cast.java` - Basic type casting
  - `typecasting_object.java` - Object type casting
  - `stringbfr.java` - StringBuffer usage

- **Topics**:
  - Primitive type casting (widening & narrowing)
  - Object type casting
  - instanceof operator
  - String conversion utilities

### 7. **wrapperclass/** - Wrapper Classes

- **Files**:
  - `wrapper_class.java` - Standard wrapper usage
  - `wrap_class.java` - Additional examples

- **Topics**:
  - Integer, Double, Boolean, Long, String wrappers
  - Autoboxing and unboxing
  - Parsing strings to primitives
  - Null values in collections

---

## 🔧 How to Compile & Run

### Using Command Line

#### **Compile All Files:**
```bash
cd java_revmp
javac -d bin src/**/*.java
```

#### **Run Specific File:**
```bash
# Example: Run TestApp_1
java -cp bin java_revamp.day_1.TestApp_1

# Example: Run Prime checker
java -cp bin java_ques.Prime

# Example: Run ArrayList demo
java -cp bin collectionss.arraylist_demo
```

#### **Common Commands:**

**Compile a single file:**
```bash
javac -d bin src/java_revamp/day_1/TestApp_1.java
```

**Compile with module info:**
```bash
javac --module-source-path src -d bin src/module-info.java src/**/*.java
```

### Using IDE (Recommended)

#### **Eclipse/IntelliJ IDEA:**
1. Import the project as existing Java project
2. Right-click on the source file
3. Select "Run As" → "Java Application"

#### **VS Code:**
1. Install "Extension Pack for Java"
2. Open the Java file
3. Click "Run" button above the main method

---

## 🎓 Topics Covered

### Fundamentals
- ✅ Data types and variables
- ✅ Operators (arithmetic, logical, relational)
- ✅ Control flow (if-else, loops)
- ✅ Methods and functions
- ✅ Scope and lifecycle

### Intermediate
- ✅ Arrays (1D, 2D, jagged)
- ✅ Strings and StringBuilder
- ✅ Scanner for user input
- ✅ Type casting and conversion
- ✅ Wrapper classes

### Object-Oriented Programming
- ✅ Classes and objects
- ✅ Encapsulation (getters/setters)
- ✅ Inheritance (single, multiple, multilevel, hierarchical)
- ✅ Polymorphism (method overriding, method overloading)
- ✅ Abstraction (interfaces and abstract classes)
- ✅ `this` and `super` keywords
- ✅ `static` and `final` keywords

### Collections & Utilities
- ✅ ArrayList
- ✅ HashMap
- ✅ HashSet
- ✅ Iterators
- ✅ Generic types

### Exception Handling
- ✅ Try-catch-finally blocks
- ✅ Custom exceptions
- ✅ Checked vs unchecked exceptions
- ✅ Exception propagation (throws)

### Problem Solving
- ✅ Mathematical algorithms
- ✅ Number manipulation
- ✅ String operations
- ✅ Logic building

---

## 📖 Directory Guide

### Source Code Organization

```
src/
├── module-info.java
├── collectionss/                 # Collections examples
│   ├── arraylist_demo.java
│   ├── hashmap_demo.java
│   └── hashset_demo.java
├── exception_handling/           # Exception handling
│   ├── except.java
│   ├── exception_demo.java
│   ├── chked_exception.java
│   └── throws_exception.java
├── interfacee/                   # Interface examples
│   ├── i1.java
│   ├── i2.java
│   ├── c1.java
│   ├── c2.java
│   └── interface_demo.java
├── java_ques/                    # Algorithmic problems
│   ├── Prime.java
│   ├── Fibonacci.java
│   ├── Factorial.java
│   ├── palindrome.java
│   ├── armstrong.java
│   ├── gcd_lcd.java
│   ├── digit_count.java
│   ├── sumofdigits.java
│   ├── reverse_num.java
│   ├── largest_smallest.java
│   ├── OddEven.java
│   ├── sortdigits.java
│   └── Swap_num.java
├── java_revamp/                  # 6-day curriculum
│   ├── day_1/
│   │   └── TestApp_1.java
│   ├── day_2/
│   │   ├── ScanFunction_2.java
│   │   ├── TypeCasting_2.java
│   │   ├── TypeConversion_2.java
│   │   ├── WrapperClass_2.java
│   │   └── SummOfNumbers_2.java
│   ├── day_3/
│   │   ├── Array_3.java
│   │   ├── TwoDimnArray_3.java
│   │   ├── JaggedArray_3.java
│   │   ├── Strings_3.java
│   │   ├── StringCRUD_3.java
│   │   └── ArrayClass_3.java
│   ├── day_4_5/
│   │   ├── oops_4.java
│   │   ├── oops_4_CRUD.java
│   │   ├── oops_4_CRUD_todo_entity.java
│   │   ├── oops_5.java
│   │   ├── oops_5_class.java
│   │   ├── oops_5_implnts.java
│   │   ├── oops_5_polymorphism.java
│   │   ├── oops_5_main_overloading.java
│   │   ├── oops_5_class_int_imp.java
│   │   ├── oops_5_user.java
│   │   └── oops_5_user_dao.java
│   └── day_6/
│       ├── single_multilevel_inheritance.java
│       ├── multiple_inheritance.java
│       ├── hierarchy_inheritance.java
│       ├── super_class.java
│       ├── thiskeyword.java
│       ├── staticc.java
│       ├── finalkeyword.java
│       └── interface_implement.java
├── type_casting/                 # Type casting
│   ├── type_cast.java
│   ├── typecasting_object.java
│   └── stringbfr.java
└── wrapperclass/                 # Wrapper classes
    ├── wrapper_class.java
    └── wrap_class.java
```

---

## 🚀 Getting Started

### First Run (Day 1)

```bash
# Navigate to project
cd java_revamp/java_revmp

# Compile
javac -d bin src/java_revamp/day_1/TestApp_1.java

# Run
java -cp bin java_revamp.day_1.TestApp_1
```

**Expected Output:**
```
Welcome to Full Stack Training
Byte value: 10
Short value: 12865
Integer value: 100000
Long value: 10000000000
Float value: 10.5
Double value: 20.99
```

### Try Interactive Input (Day 2)

```bash
javac -d bin src/java_revamp/day_2/ScanFunction_2.java
java -cp bin java_revamp.day_2.ScanFunction_2
```

### Run Problem-Solving Examples

```bash
# Prime number checker
javac -d bin src/java_ques/Prime.java
java -cp bin java_ques.Prime

# Fibonacci series
javac -d bin src/java_ques/Fibonacci.java
java -cp bin java_ques.Fibonacci
```

---

## 📝 Learning Path Recommendation

1. **Start with Day 1**: Understand Java basics and output
2. **Progress through Days 2-3**: Learn input, types, arrays, and strings
3. **Complete Days 4-5**: Master OOP concepts with practical examples
4. **Finish with Day 6**: Understand inheritance and advanced OOP features
5. **Practice with java_ques/**: Solve algorithmic problems
6. **Explore Collections**: Work with ArrayList, HashMap, HashSet
7. **Handle Exceptions**: Learn error management with exception_handling
8. **Design with Interfaces**: Create extensible code with interfacee examples

---

## 🔍 Tips for Learning

1. **Run each example** - Modify code and observe output
2. **Experiment** - Change values and see how it affects behavior
3. **Practice problems** - Solve java_ques examples before looking at solutions
4. **Build incrementally** - Don't skip any day, each builds on previous knowledge
5. **Write comments** - Explain what each section does
6. **Create variations** - Modify examples to solve similar problems

---

## ⚙️ Troubleshooting

### "javac command not found"
- Ensure JDK is installed (not just JRE)
- Check JAVA_HOME environment variable
- Restart your terminal/IDE after installation

### "Class not found"
- Verify package name matches directory structure
- Check if files are compiled to bin folder: `javac -d bin ...`
- Ensure classpath includes bin folder: `java -cp bin ...`

### "Exception in thread main"
- Check package declarations match file locations
- Ensure main method is `public static void main(String[] args)`
- Verify no syntax errors exist

---

## 📚 Additional Resources

- [Oracle Java Documentation](https://docs.oracle.com/javase/)
- [Java Tutorials by Oracle](https://docs.oracle.com/javase/tutorial/)
- Git Cheat Sheet: See `git-cheat-sheet-education.pdf`
- Full Documentation: See `Java_Revamp.pdf`

---

## 📄 License

This is a learning repository created for educational purposes.

---

## 👤 Author

Created by **Anurag Sharma**

---

## 🤝 Contributing

Feel free to fork this repository and add improvements!

---

**Happy Learning! 🎉**

Start with Day 1 and progress through each day systematically. Happy coding!
