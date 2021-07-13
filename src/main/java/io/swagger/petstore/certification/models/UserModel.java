package io.swagger.petstore.certification.models;

public class UserModel {

    private String _id;
    private String _UserName;
    private String _firstName;
    private String _lastName;
    private String _email;
    private String _password;
    private String _phone;
    private String _userStatus;

    public UserModel() {}

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_UserName() {
        return _UserName;
    }

    public void set_UserName(String _UserName) {
        this._UserName = _UserName;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_phone() {
        return _phone;
    }

    public void set_phone(String _phone) {
        this._phone = _phone;
    }

    public String get_userStatus() {
        return _userStatus;
    }

    public void set_userStatus(String _userStatus) {
        this._userStatus = _userStatus;
    }
}
