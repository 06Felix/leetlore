class UF{
    UF(List<List<String>> accounts){
        for(List<String> people : accounts){
            int sz = people.size();
            for(int i = 1 ; i < sz; i++){
                String mail = people.get(i);
                id.putIfAbsent(mail, mail);
            }
        }
    }
    public Map<String, String> id = new HashMap<>();
    public void union(String a, String b){
        id.put(find(a), find(b));
    }
    public String find(String s){
        if(id.get(s).equals(s))
            return s;
        id.put(s, find(id.get(s)));
        return id.get(s);
    }
}
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        UF uf = new UF(accounts);
        Map<String, String> m2n = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        Map<String, TreeSet<String>> repMail = new HashMap<>();
        for(List<String> people : accounts){
            int sz = people.size();
            String name = people.get(0);
            if(sz == 2){
                String ml = people.get(1);
                m2n.put(ml, name);
                uf.union(ml, ml);
                continue;
            }
            for(int i = 1 ; i < sz - 1 ; i++){
                String act = people.get(i);
                uf.union(act, people.get(i + 1));
                m2n.put(act, name);
            }
            m2n.put(people.get(sz - 1), name);
        }
        for(List<String> people : accounts){
            int sz = people.size();
            for(int i = 1 ; i < sz; i++){
                String lead = uf.find(people.get(i));
                repMail.putIfAbsent(lead, new TreeSet<>());
                repMail.get(lead).add(people.get(i));
            }
        }
        for(String rep : repMail.keySet()){
            List<String> t =  new ArrayList<>();
            t.add(m2n.get(rep));
            for(String mail : repMail.get(rep))
                t.add(mail);
            ans.add(t);
        }
        return ans;
    }
}
