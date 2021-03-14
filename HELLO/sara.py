import random


ressources = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 50, 75, 100]
nombres_dispo = [random.choice(ressources) for i in range(0, 6)]
print("Nombres disponibles", nombres_dispo)
total= random.randrange(101,999)
print("total :", total)
chemin = []
nb_combinaisons = 0
 

def depthfirst_search(total, nombres_dispo):
    
        global nb_combinaisons
        nb_combinaisons = nb_combinaisons + 1

        if len(nombres_dispo) <= 1:
            return False

        for i in range(0,len(nombres_dispo)-1):
            for j in range(i+1,len(nombres_dispo)):
                 N1 = nombres_dispo[i]
                 N2 = nombres_dispo[j]
                 nombres_dispo.pop(i)
                 nombres_dispo.pop(j-1)

                # Test multiplication 

                 if N1 * N2 == total:
                     chemin.append(str(N1) + "*" + str(N2)+"="+str(N1*N2))
                     return True
                 else:
                     tmp = N1 * N2
                     nombres_dispo.insert(0, tmp)
                     if depthfirst_search(total, nombres_dispo) :
                         chemin.insert(0, str(N1) + "*" + str(N2)+"="+str(tmp))
                         return True
                     else:
                         nombres_dispo.pop(0)

                # Test addition        

                 if N1 + N2 == total:
                     chemin.append(str(N1)+"+"+str(N2)+"="+str(N1+N2))
                     return True
                 else:
                    tmp = N1 + N2
                    nombres_dispo.insert(0,tmp)
                    if depthfirst_search(total,nombres_dispo) :
                        chemin.insert(0,str(N1) + "+" + str(N2)+"="+str(tmp))
                        return True
                    else:
                        nombres_dispo.pop(0)


                      # Test soustraction    
                        
                 if N1 < N2:
                     tmp = N2 - N1
                     if tmp == total:
                        chemin.append(str(N1) + "-" + str(N2)+"="+str(N1-N2))
                        return True
                     else:
                         nombres_dispo.insert(0, tmp)
                     if depthfirst_search(total, nombres_dispo) :
                        chemin.insert(0, str(N1) + "-" + str(N2)+"="+str(N1-N2))
                        return True
                     else:
                        nombres_dispo.pop(0)
                 if N1 > N2:
                    tmp = N1 - N2
                    if tmp == total:
                        chemin.append(str(N1) + "-" + str(N2)+"="+str(tmp))
                        return True
                 else:
                    nombres_dispo.insert(0, tmp)
                    if depthfirst_search(total, nombres_dispo):
                        chemin.insert(0, str(N1) + "-" + str(N2)+"="+str(N1-N2))
                        return True
                    else:
                        nombres_dispo.pop(0)
                  # Test division
                 if (N1 > N2) & (N2 != 0) & (N1 % N2 == 0):
                    tmp = N1 / N2
                    nombres_dispo.insert(0, tmp)
                    if tmp == total:
                        chemin.append(str(N1) + "/" + str(N2)+"="+str(tmp))
                        return True
                    else:
                        if depthfirst_search(total, nombres_dispo) :
                            chemin.insert(0, str(N1) + "-" + str(N2))
                            return True
                        else:
                            nombres_dispo.pop(0)
                 if (N1 < N2) & (N1 != 0) & (N2 % N1 == 0):
                    tmp = N2 / N1
                    nombres_dispo.insert(0, tmp)
                    if tmp == total:
                        chemin.append(str(N1) + "/" + str(N2))
                        return True
                    else:
                        if depthfirst_search(total, nombres_dispo) :
                            chemin.insert(0, str(N1) + "-" + str(N2))
                            return True
                        else:
                            nombres_dispo.pop(0)
                 nombres_dispo.insert(i,N1)
                 nombres_dispo.insert(j,N2)
        return False
        

if depthfirst_search(total,nombres_dispo):
    print("LE COMPTE EST BON !")
    for i in range(0,len(chemin)):
         print(chemin[i])
    print ("combinaisons testée",nb_combinaisons)      
else:
    print("Failed")
    print ("combinaisons testée",nb_combinaisons)  
