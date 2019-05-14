# Euler-cycle
This algorythm finds Euler cycle in an undirected graph.<br />
Graph is read from input.txt file. It has to be in adjacent matrix form.<br />
procedure Euler(G)<br />
STEKAS := ∅; CIKLAS := ∅;<br />
v := bet kuri grafo G viršun ̄ e; ̇<br />
STEKAS ⇐ v; /* Itraukiame  ̨ viršun ̄ e ̨ v i ̨steka*/  ̨<br />
while STEKAS 6= ∅ do<br />
v := top(STEKAS);<br />
if GRET[v] 6= ∅ then<br />
u ⇐ GRET[v];<br />
STEKAS ⇐ u;<br />
GRET[v] := GRET[v] \ {u};<br />
GRET[u] := GRET[u] \ {v};<br />
v := u;<br />
else<br />
v ⇐ STEKAS; /* Šaliname viršun ̄ e ̨ v iš steko */<br />
CIKLAS ⇐ v;<br />
end;<br />
end;<br />
