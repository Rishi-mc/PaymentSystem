# Task 8: Interface-Based Payment System

Demonstrates **interfaces** and **polymorphism** in Java through a simple payment processing system.

## Concepts Covered

| Concept | Where |
|---|---|
| Interface declaration | `Payment.java` |
| Interface implementation | `UPIPayment.java`, `CardPayment.java` |
| Polymorphism | `PaymentSystem.java` — both stored as `Payment` type |
| ArrayList | `transactionIds` in `PaymentSystem.java` |

## Project Structure

```
PaymentSystem/
├── src/
│   ├── Payment.java         # Interface
│   ├── UPIPayment.java      # UPI implementation
│   ├── CardPayment.java     # Card implementation
│   └── PaymentSystem.java   # Driver / main class
└── README.md
```

## How to Run

```bash
# Compile all files from the src/ directory
javac src/*.java -d out/

# Run the main class
java -cp out PaymentSystem
```

## Expected Output

```
===== Payment System =====

--- UPI Payment ---
UPI Payment of ₹499.0 initiated via rishi@upi
Transaction ID: UPI-<timestamp>

--- Card Payment ---
Card Payment of ₹1299.0 charged to **** **** **** 5678 (Rishi Kumar)
Transaction ID: CARD-<timestamp>

===== Transaction History =====
1. UPI-<timestamp>
2. CARD-<timestamp>

Total transactions: 2
```

## Key Takeaway

Both `UPIPayment` and `CardPayment` are stored as `Payment` references — this is **runtime polymorphism**. The correct `payAmount()` implementation is called based on the actual object type, not the reference type.
