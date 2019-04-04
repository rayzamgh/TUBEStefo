/**
 * \class EggProducingAnimal
 * \brief EggProducingAnimal adalah class turunan Animal berupa kategori Animal yang menghasilkan Egg di game
 *
 * MilkProducingAnimal menghasilkan milk jika dilakukan method InterractWith()  
 * oleh player yang berada di sekitar MilkProducingAnimal 
 *
 * \author Ahmad Rizal Alifio
 * 
 */
#ifndef _EGGPRODUCINGANIMAL_H
#define _EGGPRODUCINGANIMAL_H

#include <iostream>
#include "Animal.h"
using namespace std;

class EggProducingAnimal : public Animal {
    protected:
        bool haveEgg;
    public:
        //CTOR
        /**
         * \brief Constructor EggProducingAnimal dengan parametered location dan animalSound
         * \param _x posisi x EggProducingAnimal
         * \param _y posisi y EggProducingAnimal
         * \param _animalSound suara dari EggProducingAnimal
         */
        EggProducingAnimal(int _x, int _y, string _animalSound);   //init haveEgg = false
        
        //SETTER
        void SetHaveEgg(bool _haveEgg);///Setter atribut haveEgg
        bool IsHaveEgg();   ///fungsi checker kondisi haveEgg
};
#endif