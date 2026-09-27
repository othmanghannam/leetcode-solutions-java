# 0242. Valid Anagram (Easy)

[Lien LeetCode](https://leetcode.com/problems/valid-anagram/)

## Solutions

| Solution | Approche | Time | Space | Runtime | Memory |
| :--- | :--- | :---: | :---: | :---: | :---: |
| **V1** | Tableau de fréquences + Recherche linéaire d'index | $O(26 \times n)$ | $O(1)$ | 8 ms (30.57%) | 44.68 MB (55.32%) |
| **V2** | Tableau de fréquences + Hachage direct ASCII | $O(n)$ | $O(1)$ | 5 ms (63.35%) | 44.28 MB (81.56%) |

---

## Détails des approches

### Solution V1 : Recherche séquentielle dans un tableau de caractères
- **Principe :** Utilise un tableau `verification` contenant les 26 lettres de l'alphabet. Pour chaque lettre des chaînes $s$ et $t$, une boucle interne parcourt ce tableau pour trouver manuellement la position correspondante dans le tableau de comptage.
- **Limitation :** Bien que valide, la recherche séquentielle entraîne une boucle imbriquée de taille 26 pour chaque caractère, ce qui ralentit l'exécution globale ($26 \times n$ opérations).

### Solution V2 : Calcul direct de l'index via le code ASCII
- **Principe :** Utilise l'arithmétique des caractères (`c - 'a'`) pour projeter instantanément chaque lettre minuscule sur un index compris entre $0$ et $25$ en temps constant $O(1)$.
- **Optimisation :** 
  - Parcourt $s$ et $t$ simultanément dans une boucle unique via `.charAt(i)`.
  - Supprime les boucles imbriquées et évite l'allocation mémoire intermédiaire de `.toCharArray()`.
  - Réduit le runtime à 5 ms et optimise l'empreinte mémoire à 44.28 MB.