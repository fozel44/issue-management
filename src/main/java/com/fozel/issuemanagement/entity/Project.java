package com.fozel.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name ="project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "project_code",unique = true)
    private String projectCode;
    @Column(name = "project_name",length = 1000)
    private String projectName;
    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    private User manager;
}
