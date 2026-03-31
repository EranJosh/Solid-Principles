# Solid-Principles

This project refactors a monolithic order processing system by applying SOLID principles. The original single interface and class were split into four focused interfaces — OrderCalculator, OrderPlacer, InvoiceGenerator, and NotificationSender — each with its own implementation. An OrderService class orchestrates the workflow through dependency injection, making the system easier to maintain, test, and extend without modifying existing code.

<img width="8192" height="923" alt="UML Class Diagram" src="https://github.com/user-attachments/assets/f5736d75-bfd2-4c72-93e1-9d5aea5eba50" />
