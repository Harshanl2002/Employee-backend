package com.HpIntern.task1.Model;


import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String tittle;
}
