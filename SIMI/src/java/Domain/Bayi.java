/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import javax.persistence.*;

/**
 *
 * @author LabGSG
 */
@Entity
@Table(name = "bayi")
public class Bayi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bayi_id")
    private Integer id;
    @Column(name = "bayi_nama", nullable = false, length = 30)
    private String nama;
    @Column(name = "bayi_jk", nullable = false, length = 255)
    private String jk;
    @Column(name = "bayi_tanggal_lahir", nullable = false, length = 50)
    private String tanggal_lahir;
}
