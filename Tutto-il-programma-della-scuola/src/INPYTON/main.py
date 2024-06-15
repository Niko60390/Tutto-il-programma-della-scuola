"""
Cognome:    Tauro
Nome:       Nicolò 
"""

diz={"maschile":[], "femminile":[], "neutro":[]}
'''
print("Per uscire dal programma scrivere (Fine)")
print("\nNon conosco il genere di questo nome: Roberto")
nome = ""
while nome.lower() != "fine":
    nome = input("Questo nome é <m>Maschio, <f>Femminile o <n>Neutro")
    if nome == "fine" or nome == "Fine":
        cond=False
    elif risposta
    print("CIao")
'''

nome = input("Inserisci un nome: ")
while nome.lower() != "fine":
    if nome in diz["maschile"]:
        print("E'un nome maschile")
    elif nome in diz["femminile"]:
        print("E'un nome femminile")
    elif nome in diz["neutro"]:
        print("E'un nome neutro")
    else:
        cosa = input("Non conosco questo nome é <m>Maschio, <f>Femminile o <n>Neutro")
        if cosa.lower() == "m":
            diz["maschile"] = diz["maschile"] + [nome]
        elif cosa.lower() == "f":
            diz["femminile"] = diz["femminile"] + [nome]
        elif cosa.lower() == "n":
            diz["neutro"] = diz["neutro"] + [nome]
        else:
            print("Non ho capito...")
    nome=input("Inserisci un nome: ")
print("Addio, mondo crudele")

