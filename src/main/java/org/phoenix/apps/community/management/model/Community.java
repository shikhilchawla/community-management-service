package org.phoenix.apps.community.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Community {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="communityId")
    private int communityId;
    private String name;
    private String description;
}
