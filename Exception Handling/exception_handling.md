# Java Exception Handling – Quick Revision Notes

## 🔹 What is Exception Handling?

Exception Handling in Java is a mechanism to handle runtime errors so that the normal flow of the program is maintained.

An Exception is an event that disrupts the normal execution of a program.

## 🔹 Basic Keywords
1. **try**

   Contains code that may cause an exception.
2. **catch**

   Handles the exception if it occurs.
3. **finally**

   Always executes.

   Used to close resources (files, DB connections, network connections).

## 🔹 Basic Example
```java
public class Example {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("This always runs");
        }
    }
}
```

## 🔹 throw vs throws
- **throw**
  - Used to explicitly throw an exception.
  - Used inside method body.
  - Throws only one exception at a time.
  - Example: `throw new ArithmeticException("Invalid age")`
- **throws**
  - Declares exceptions that a method may throw.
  - Used in method signature.
  - Mainly used for checked exceptions.
  - Example: `static void readFile() throws IOException`

## 🔹 Exception Hierarchy
All exceptions are subclasses of:
- Object
  └── Throwable
        ├── Exception
        │     ├── Checked Exception
        │     └── Unchecked Exception
        └── Error

## 🔹 Types of Exceptions
1. **Checked Exceptions**
   hecked at compile time.an be handled or declared.xample: IOException, SQLException. **Unchecked Exceptions**
dChecked at runtime.
dNot mandatory to handle.
dExample: ArithmeticException, NullPointerException. **User-Defined Exception**
tCustom exception created by extending Exception.

## 🔹 Important Methods of Exception Class
- `printStackTrace()` → Prints full stack trace.
p- `getMessage()` → Returns exception message.
p- `toString()` → Returns exception name + message.

## 🔹 Multiple Catch Blocks 
def { // risky code } catch (ArithmeticException e) { } catch (NullPointerException e) { }
def { // risky code } catch (ArithmeticException e) { } catch (NullPointerException e) { }
def { // risky code } 
systematic handling with multiple catches can be implemented as shown above.
different exceptions can be caught separately for precise handling.
'these blocks are ordered from most specific to most general.'}"}