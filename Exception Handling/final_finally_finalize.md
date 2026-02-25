# Java Final, Finally, and Finalize – Quick Revision Notes

## 🔹 1. final Keyword

The `final` keyword is used to restrict modification.

It can be applied to:
- Variables
- Methods
- Classes

### ✔ Final Variable
- Value cannot be changed once initialized.
- Acts like a constant.

```java
class Example {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20;  // Compile-time error
    }
}
```
### ✔ Final Method
- Cannot be overridden in subclass.
### ✔ Final Class
- Cannot be inherited.
- Example: String class.

## 🔹 2. finally Keyword

Used in exception handling.
- Always executes after `try` (whether exception occurs or not).
- Used for cleanup (closing files, DB connections, etc.)

### Syntax Structure:
```java
try {
    // risky code
} catch (Exception e) {
    // handle exception
} finally {
    // always executes
}
```
### Key Points:
- Executes even if exception is not thrown.
- Executes even if return statement is present in try or catch.
- Commonly used for resource cleanup.

## 🔹 3. finalize() Method

default of Object class.
Called by Garbage Collector before object destruction.
Used for cleanup operations.
deprecated since Java 9 (not recommended).
### Syntax:
default void finalize() throws Throwable {
    // cleanup code 
default }
defaults:
defined as protected void finalize() throws Throwable { /* ... */ }
defined as deprecated and should not be used in modern applications. Prefer try-with-resources instead.

## 🔹 Differences: final vs finally vs finalize 
| Feature | final | finally | finalize() |
|---------|--------|---------|------------|
| Type | Keyword | Keyword | Method |
| Used With | Variables, Methods, Classes | try-catch block | Objects |
| Purpose | Restrict modification | Ensure execution | Cleanup before GC |
e| Execution | When declared | Always after try-catch | Called by GC (not guaranteed) |
'text'
to=functions.convert_text_to_markdown