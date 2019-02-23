package com.taqy.learning.taqypetclinic.bootstrap;

import com.taqy.learning.taqypetclinic.model.Owner;
import com.taqy.learning.taqypetclinic.model.Vet;
import com.taqy.learning.taqypetclinic.services.OwnerService;
import com.taqy.learning.taqypetclinic.services.VetService;
import com.taqy.learning.taqypetclinic.services.map.OwnerServiceMap;
import com.taqy.learning.taqypetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Taqreez");
        owner1.setLastName("Ali");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(1L);
        owner2.setFirstName("Areeb");
        owner2.setLastName("Ali");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Javed");
        vet1.setLastName("Ali");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Salim");
        vet2.setLastName("Khan");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }

}
