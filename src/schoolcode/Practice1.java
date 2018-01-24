package schoolcode;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc",b="foo",c="bar",d="";
		String e = "0123456789",f="aeiou";
		String g = "gobblyg00k", h="Where am I?";
		String i="foobar";
		String f1="Fuzzy Wuzzy was a bear";
		String f2="had no hair", f3 = "n't";
		int j= a.length();
		int k = b.indexOf("o");
		int l = e.indexOf("o");
		boolean m = a.equals(b);
		int n = d.length();
		String o = b.substring(1);
		String p = g.substring(0,4);
		boolean q = (b+c).equals(i);
		boolean r = (b).equals(i);
		String s = c.substring(c.indexOf(f.substring(0,1)));
		int t = h.indexOf(f.substring(2,3));
		String u = h.substring(h.indexOf(f.substring(1,2)));
		String v = g.substring(0,g.indexOf(e.substring(0,1)))+b.substring(1)+g.substring(g.length()-1);
		String w = f1.substring(0);
		String x = f1.substring(0, 12) + f2;
		String y = f1.substring(0,15)+f3+" f"+f1.substring(1,6)+f1.substring(12,16)+"he?";
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		
		String name1 = "Frankling Delano Roosevelt";
		int blank1=name1.indexOf(" ");
		int blank2 = name1.substring(blank1+1).indexOf(" ");
		name1=name1.substring(blank1+1, blank1+1+blank2);
		System.out.println("*" + name1 + "*");
		
	}

}
