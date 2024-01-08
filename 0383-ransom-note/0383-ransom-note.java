class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char [] ransomNoteArray = ransomNote.toCharArray();
        char [] magazineArray = magazine.toCharArray();
        Arrays.sort(ransomNoteArray);
        Arrays.sort(magazineArray);
        if (ransomNoteArray.length == magazineArray.length) {
           return Arrays.equals(ransomNoteArray, magazineArray);
        }
        int c1 = 0, c2 = 0;
        while (c1 < ransomNoteArray.length && c2 < magazineArray.length) {
            if(ransomNoteArray[c1] == magazineArray[c2]) {
                c1++;
                c2++;
            }
            else {
                c2++;
            }
        }
        System.out.println("c1: " +c1);
        if(c1 == ransomNoteArray.length) {
            return true;
        }
        return false;
    }
}