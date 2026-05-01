class Solution {
    public boolean isAnagram(String s, String t) {
        int l=s.length();
        int k=t.length();

        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();

        if(l!=k){
            return false;
        }

        for(int i=0;i<l;i++){
            Character sc = s.charAt(i);
            Character tc= t.charAt(i);
            hm.put(sc,hm.getOrDefault(sc,0)+1);
            hm.put(tc,hm.getOrDefault(tc,0)-1);  
        }
        for(int i:hm.values()){
            if(i!=0){
                return false;
            }
        }
        return true;

    }
}