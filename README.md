# MeinCraft - Lightweight Interpreted Language with LLVM IR

MeinCraft is a simple interpreted language implemented in Java using ANTLR4. It supports basic data types, conditionals, loops, arrays, matrices, and LLVM IR code generation for execution via Clang. The project is primarily educational, showcasing compiler construction and code generation techniques.

This project was developed as part of a university course on interpreters and compilers. It focuses on:
- Lexical/syntactic parsing via ANTLR4
- Runtime interpretation and static LLVM code generation
- Simple type inference and runtime scope handling

## Features

- **Primitive Types**: `int`, `float`, `boolean`, `string`
- **Arrays & Matrices**: Nested list support (e.g. `[1, 2]`, `[[1,2], [3,4]]`)
- **Arithmetic Operations**: `+`, `-`, `*`, `/`
- **Boolean Logic**: `AND`, `OR`, `XOR`, `NEG`, including `true/false` and `1/0` interop
- **Comparisons**: `==` (equality check)
- **I/O Support**:
  - `read` – dynamically typed input (infers type)
  - `print` – formatted output based on value type
- **Control Flow**:
  - `if / elif / else` conditionals
  - Proper block scoping and label generation
- **LLVM Code Generation**:
  - Generates valid LLVM IR
  - Can be compiled and executed using `clang`

## 🛠 Requirements

- Java 17+
- [ANTLR4](https://www.antlr.org/) (for parser generation)
- [Clang](https://clang.llvm.org/) (to compile the generated `output.ll`)
- Windows (PowerShell-based scripts; can be adapted to other platforms)

## Getting Started

1. **Generate the parser (if needed):**

   ```bash
   antlr4 -Dlanguage=Java -visitor meincraft.g4 -o gen

2. **Running the project:**
   ```bash
   ./make.ps1

3. **Example file:**
   ```text
   x = read;
   if (x == 1) then:
     print("one");
   elif (x == 2) then:
     print("two");
   else:
     print("other");
   end
