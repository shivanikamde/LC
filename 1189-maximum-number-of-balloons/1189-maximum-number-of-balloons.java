class Solution {
    public int maxNumberOfBalloons(String text) {
        int size=text.length();
        // created hashmap to store frequency of each char in text
        HashMap<Character,Integer> hm=new HashMap<>();

        //storing freq; if char already present then val++ or else val=1
        for(int i=0;i<size;i++){
            char curr=text.charAt(i);
            if(hm.containsKey(curr)){
                hm.put(curr,hm.get(curr)+1);
            }
            else{
                hm.put(curr,1);
            }
        }

        //checking w balloon logic now
        //updated existing frequency of each char in the int
        int b=hm.getOrDefault('b',0);
        int a=hm.getOrDefault('a',0);
        int l=hm.getOrDefault('l',0);
        int o=hm.getOrDefault('o',0);
        int n=hm.getOrDefault('n',0);

        int answer=Math.min(Math.min(Math.min(a,b),Math.min(l/2, o/2)),n);
        return answer;
    }
}