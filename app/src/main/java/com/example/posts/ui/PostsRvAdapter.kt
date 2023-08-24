package com.example.posts.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.posts.databinding.PostsListItemBinding
import com.example.posts.models.Posts
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class PostsRvAdapter(var post: List<Posts>):RecyclerView.Adapter<PostsRvAdapter.PostsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PostsViewHolder {
        val binding=PostsListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PostsViewHolder(binding)
    }
    override fun onBindViewHolder(holder: PostsViewHolder, position: Int) {
        val currentPosts = post.get(position)
        val binding = holder.binding
        binding.imgPost.tag=currentPosts.toString()
        binding.tvBody.text= currentPosts.body
        binding.tvText.text= currentPosts.title
        binding.tvid.text=currentPosts.id.toString()
        binding.tvuserId.text=currentPosts.userId.toString()
        Picasso
            .get().load(currentPosts.id)
            .resize(80, 80)
            .centerInside()
            .transform(CropCircleTransformation())
            .into(binding.imgPost)
            }
        override fun getItemCount(): Int {
            return post.size
        }
    class PostsViewHolder(var binding: PostsListItemBinding):RecyclerView.ViewHolder(binding.root)
}
