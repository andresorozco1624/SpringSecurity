package com.example.demo.entities;

import com.example.demo.utils.Rol;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Null;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity
@Table(name = "user")
public class UserEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Null
    private Long id;

    @NotBlank
    private String userName;

    private String name;

    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority>  authorities =rol.getPermissions().stream()
                .map(permissionEnum -> new SimpleGrantedAuthority(permissionEnum.name()))
                .collect(Collectors.toList());
        authorities.add(new SimpleGrantedAuthority( "ROl_" + rol.name()));
        return authorities;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {return false;}

    @Override
    public boolean isEnabled() {
        return true;
    }
}
