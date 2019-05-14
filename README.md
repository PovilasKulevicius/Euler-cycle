# Euler-cycle
This algorythm finds Euler cycle in an undirected graph.
Graph is read from input.txt file. It has to be in adjacent matrix form.
procedure Euler(G)
STEKAS := ∅; CIKLAS := ∅;
v := bet kuri grafo G viršun ̄ e; ̇
STEKAS ⇐ v; /* Itraukiame  ̨ viršun ̄ e ̨ v i ̨steka*/  ̨
while STEKAS 6= ∅ do
v := top(STEKAS);
if GRET[v] 6= ∅ then
u ⇐ GRET[v];
STEKAS ⇐ u;
GRET[v] := GRET[v] \ {u};
GRET[u] := GRET[u] \ {v};
v := u;
else
v ⇐ STEKAS; /* Šaliname viršun ̄ e ̨ v iš steko */
CIKLAS ⇐ v;
end;
end;
