# OOP Principles in Java — Lab Tasks

Java exercises demonstrating core Object-Oriented Programming principles: encapsulation, inheritance, polymorphism, and interfaces.

## Task 1 — Digital Wallet (Encapsulation)

**Objective:** Understand data hiding and why public fields are dangerous in software construction.

`DigitalWallet` enforces strict encapsulation:
- `accountHolder` and `pinCode` are `private final` — set once in the constructor, never exposed or changeable afterward.
- `balance` is `private` and can only be modified through `withdraw()` and `deposit()`.
- `withdraw(double amount, String enteredPin)` only processes a withdrawal if the PIN matches and sufficient funds exist.
- The balance can never go negative.

**Files:** `DigitalWallet.java`, `Main.java`

## Task 2 — Employee Pay System (Inheritance & Polymorphism)

**Objective:** Demonstrate code reusability (Inheritance) and dynamic behavior (Polymorphism).

- `Employee` is the base class with `name`, `baseSalary`, and `calculatePay()`.
- `Developer extends Employee` — pay includes a fixed `techAllowance`.
- `SalesManager extends Employee` — pay includes a commission based on sales.
- `Main` builds a `List<Employee>` containing both subtypes and calls `calculatePay()` on each through the base type, showing dynamic method dispatch in action.

**Files:** `Employee.java`, `Developer.java`, `SalesManager.java`, `Main.java`

## Task 3 — Smart Devices (Interfaces)

**Objective:** Understand how interfaces force classes to guarantee specific behaviors.

- `SmartDevice` interface defines the contract: `turnOn()`, `turnOff()`, `getStatus()`.
- `SmartBulb implements SmartDevice` — adds `setBrightness(int level)`.
- `SmartThermostat implements SmartDevice` — adds `setTemperature(double temp)`.

**Files:** `SmartDevice.java`, `SmartBulb.java`, `SmartThermostat.java`, `Main.java`

## Running

Each task's `Main.java` can be run independently:

```bash
javac *.java
java Main
```

