## Ledger Invariants
- Every transaction must have >= 2 ledger entries
- Sum of ledger entries per transaction must equal zero
- Ledger entries are immutable
- All entries of a transaction are committed atomically

## Domain Definitions
- Account: owns a balance
- Transaction: logical grouping of ledger entries
- Ledger Entry: debit or credit against an account

## Prohibited Operations
- Updating ledger entries
- Direct balance mutation outside a transaction
