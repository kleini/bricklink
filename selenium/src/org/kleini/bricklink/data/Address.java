/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import java.util.Date;

/**
 * Data object for a customers address.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Address {

    private String username;
    private String name;
    private String address;
    private String country;
    private String email;
    private Date lastLoggedIn;

    public Address() {
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(Date lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Username: "); sb.append(username); sb.append('\n');
        sb.append("Name: "); sb.append(name); sb.append('\n');
        sb.append("Address: "); sb.append(address); sb.append('\n');
        sb.append("Country: "); sb.append(country); sb.append('\n');
        sb.append("EMail: "); sb.append(email);
        return sb.toString();
    }
}
