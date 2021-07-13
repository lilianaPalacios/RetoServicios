package io.swagger.petstore.certification.models;

public class PlaceAnOrderModel {

    private String _id;
    private String _petId;
    private String _quantity;
    private String _shipDate;
    private String _status;
    private String _complete;

    public PlaceAnOrderModel() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_petId() {
        return _petId;
    }

    public void set_petId(String _petId) {
        this._petId = _petId;
    }

    public String get_quantity() {
        return _quantity;
    }

    public void set_quantity(String _quantity) {
        this._quantity = _quantity;
    }

    public String get_shipDate() {
        return _shipDate;
    }

    public void set_shipDate(String _shipDate) {
        this._shipDate = _shipDate;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public String get_complete() {
        return _complete;
    }

    public void set_complete(String _complete) {
        this._complete = _complete;
    }
}

