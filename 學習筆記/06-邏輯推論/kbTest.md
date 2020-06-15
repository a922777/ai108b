    > python kbTest.py
    ['A<=B', 'B<=C&D', 'C<=E', 'D<=F', 'E', 'F', 'Z<=C&D&G', '']
    rule:head=A terms=['B']     
    rule:head=B terms=['C', 'D']
    rule:head=C terms=['E']     
    rule:head=D terms=['F']
    rule:head=E terms=
    rule:head=F terms=
    rule:head=Z terms=['C', 'D', 'G']
    addFact(E)
    addFact(F)
    addFact(C)
    addFact(D)
    addFact(B)
    addFact(A)
    facts= dict_keys(['E', 'F', 'C', 'D', 'B', 'A'])