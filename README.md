# Euler-cycle
This algorythm finds Euler cycle in an undirected graph.<br />
Graph is read from input.txt file. It has to be in adjacent matrix form.<br />
# Pseudocode
procedure Euler(G)<br />
&nbsp;&nbsp;STEKAS := ∅; CIKLAS := ∅;<br />
&nbsp;&nbsp;v := bet kuri grafo G viršun ̄ e; ̇<br />
&nbsp;&nbsp;STEKAS ⇐ v; /* adding vertex to a stack*/  ̨<br />
&nbsp;&nbsp;while STEKAS 6= ∅ do<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;v := top(STEKAS);<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;if GRET[v] 6= ∅ then<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;u ⇐ GRET[v];<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;STEKAS ⇐ u;<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;GRET[v] := GRET[v] \ {u};<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;GRET[u] := GRET[u] \ {v};<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;v := u;<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;v ⇐ STEKAS; /* deleting vertex from stack */<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;CIKLAS ⇐ v;<br />
&nbsp;&nbsp;end;<br />
end;<br />
