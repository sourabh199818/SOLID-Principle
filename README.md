
# 📦 SOLID Principles Demo (Java)

This project demonstrates the use of **SOLID principles** in Java through a simple employee report generation system. The design follows clean architecture guidelines, making the code maintainable, scalable, and extensible.

---

## 📚 What are SOLID Principles?

**SOLID** is an acronym for five object-oriented design principles intended to make software more understandable, flexible, and maintainable:

| Principle | Description |
|----------|-------------|
| **S** - Single Responsibility | Each class should have only one reason to change |
| **O** - Open/Closed | Software entities should be open for extension but closed for modification |
| **L** - Liskov Substitution | Subtypes must be substitutable for their base types |
| **I** - Interface Segregation | No client should be forced to depend on methods it does not use |
| **D** - Dependency Inversion | Depend on abstractions, not concretions |

---

## 🛠️ Technologies Used

- Java 8+
- Object-Oriented Programming (OOP)
- SOLID Design Patterns
- No external dependencies

---

## 🧰 Project Structure

```bash
src/
├── Main.java                        # Application entry point
│
├── controller/
│   └── MainController.java          # Coordinates report generation
│
├── model/
│   └── Employee.java                # Model class for employee details
│
├── service/
│   ├── ReportGenerator.java         # Interface for report generation
│   ├── ReportPDFPrinter.java        # Generates PDF reports
│   ├── ReportJSONPrinter.java       # Generates JSON reports
│   └── ReportFactory.java           # Returns appropriate report generator

##  Output

PDF Report:
Name: Sourabh
Dept: Engineering
JSON Report:
Name: Abhinav
Dept: Commerce

