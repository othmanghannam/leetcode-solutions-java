# 0217. Contains Duplicate (Easy)

[Lien LeetCode](https://leetcode.com/problems/contains-duplicate/)

## Solution

| Solution | Approche | Time | Space | Runtime |
| :--- | :--- | :---: | :---: | :---: |
| **V1** | HashSet Lookup | $O(n)$ | $O(n)$ | 18 ms (76.98%) |

## Note clé
- L'utilisation d'un `HashSet` permet des opérations de recherche (`contains`) et d'insertion (`add`) en temps constant moyen $O(1)$, ce qui garantit une complexité temporelle globale optimale en $O(n)$.