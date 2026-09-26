# 0001. Two Sum (Easy)

[Lien LeetCode](https://leetcode.com/problems/two-sum/)

## Comparaison des approches

| Solution | Approche | Time | Space | Runtime |
| :--- | :--- | :---: | :---: | :---: |
| **V1** | Brute Force (Nested loops) | $O(n^2)$ | $O(1)$ | 45 ms (26.90%) |
| **V2** | One-Pass HashMap (Optimal) | $O(n)$ | $O(n)$ | 2 ms (99.40%) |

## Note clé
- Utiliser une `HashMap` pour stocker `(valeur -> indice)` permet de retrouver le complément en temps constant $O(1)$.