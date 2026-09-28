# 0049. Group Anagrams (Medium)

[Lien LeetCode](https://leetcode.com/problems/group-anagrams/)

## Solutions

| Solution | Approche | Time | Space | Runtime | Memory |
| :--- | :--- | :---: | :---: | :---: | :---: |
| **V1** | Tri alphabétique des caractères + HashMap | $O(N \cdot K \log K)$ | $O(N \cdot K)$ | *(à remplir avec vos stats)* | *(à remplir)* |

*Où $N$ est le nombre total de mots et $K$ est la longueur maximale d'un mot.*

---

## Détails de l'approche

### Solution V1 : Signature par tri de lettres
- **Principe :** 
  - Deux mots sont des anagrammes s'ils possèdent exactement les mêmes lettres avec les mêmes occurrences.
  - En triant chaque mot par ordre alphabétique (`char[] chars = word.toCharArray(); Arrays.sort(chars);`), tous les anagrammes d'une même famille produisent une chaîne canonique unique (par exemple `"eat"`, `"tea"` et `"ate"` deviennent tous `"aet"`).
  - On utilise une table de hachage `Map<String, List<String>>` où :
    - La **clé** est le mot trié (`"aet"`).
    - La **valeur** est une liste dynamique regroupant les mots originaux (`["eat", "tea", "ate"]`).
- **Complexité :**
  - **Temps :** $O(N \cdot K \log K)$ — on itère sur les $N$ mots et on trie chacun d'eux en $O(K \log K)$.
  - **Espace :** $O(N \cdot K)$ — nécessaire pour stocker les clés et les listes de mots dans la `HashMap`.