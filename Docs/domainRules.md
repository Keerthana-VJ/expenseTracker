# General

1. Prefer readable code over clever implementations.
2. Choose variable and method names that are self-explanatory.
3. Business logic must live in Service classes.
   - Utility packages are allowed **only for stateless helper functions**
   - No core business logic in utility classes.
4. If a known edge case or limitation is intentionally not handled:
   - Document it clearly with a comment
   - Prefer adding a TODO with context
   - Do not leave undocumented behavior

# Naming

1. Classes  
   - Use domain language  
   - Examples: `TransactionService`, `AccountService`

2. Methods  
   - Avoid verbs like `handle`, `do`, `process`
   - Method names must describe the behavior of the method
   - Example: `executeP2PTransfer`

3. Variables  
   - No abbreviations like `amt`, `bal`
   - Use full names like `amount`, `balance`
