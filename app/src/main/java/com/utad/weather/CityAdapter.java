package com.utad.weather;

/**
 * Created by alexsari on 01/03/2017.
 */

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class CityAdapter<T, VH extends RecyclerView.ViewHolder>
        extends RecyclerView.Adapter<VH> {

    public interface StableIdProvider<T> {

        Object getId(T item);
    }

    private List<T> mObjects;

    public CityAdapter(@Nullable final List<T> objects) {
        mObjects = objects != null ? objects : new ArrayList<T>();
    }

    public CityAdapter() {
        this(null);
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {

    }

    /**
     * Adds the specified object at the end of the array.
     *
     * @param object The object to add at the end of the array.
     */
    public void add(final T object) {
        mObjects.add(object);
        notifyItemInserted(getItemCount() - 1);
    }

    /**
     * Adds the specified list of objects at the end of the array.
     *
     * @param objects The objects to add at the end of the array.
     */
    public void addAll(final List<T> objects) {
        if (objects == null) {
            mObjects.clear();
        } else {
            mObjects.addAll(objects);
        }
        notifyDataSetChanged();
    }

    /**
     * Inserts the specified object at the specified index in the array.
     *
     * @param object   The object to insert into the array.
     * @param position The index at which the object must be inserted.
     */
    public void addItem(final int position, final T object) {
        mObjects.add(position, object);
        notifyItemInserted(position);
    }

    /**
     * Adds the specified object to the end of the array.
     *
     * @param object The object to append
     */
    public void addItem(final T object) {
        addItem(mObjects.size(), object);
    }

    /**
     * Remove all elements from the list.
     */
    public void clear() {
        final int size = getItemCount();
        mObjects.clear();
        notifyItemRangeRemoved(0, size);
    }

    public T getItem(final int position) {
        try {
            return mObjects.get(position);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public int getItemCount() {
        return mObjects.size();
    }

    public long getItemId(final int position) {
        return position;
    }

    /**
     * Returns the position of the specified item in the array.
     *
     * @param item The item to retrieve the position of.
     * @return The position of the specified item.
     */
    public int getPosition(final T item) {
        return mObjects.indexOf(item);
    }

    /**
     * Removes the specified object from the array.
     *
     * @param object The object to remove.
     */
    public void remove(T object) {
        final int position = getPosition(object);
        mObjects.remove(object);
        notifyItemRemoved(position);
    }

    public void removeLastObject() {
        mObjects.remove(mObjects.size() - 1);
        notifyItemRemoved(mObjects.size() - 1);
    }
}