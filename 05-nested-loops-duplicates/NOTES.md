# Nested-loop notes

## Roles of the indexes

- `i` = the current number being processed.
- `j` = searches numbers after `i`.
- `k` = checks numbers before `i` to see whether the current number was already processed.

## `break`

`break` stops the loop that contains it.

If it is inside the `k` loop, it stops `k`.

If a separate `break` is inside the outer `i` loop, it stops `i` too.

## `continue`

`continue` skips the rest of the current iteration of the loop that contains it.

In the frequency program:

```java
if (alreadyProcessed) {
    continue;
}
```

means: this number was already handled, so skip the rest of this `i` iteration and move to the next `i`.

## Why `count = 1`?

The current number is already one occurrence. The `j` loop adds any later matches.

## Important distinction

- Frequency/unique problems: already processed -> `continue` to the next `i`.
- First-duplicate problem: duplicate found -> `break` the search and then `break` the outer `i` loop.
