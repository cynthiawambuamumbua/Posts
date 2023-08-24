package com.example.posts.ui//package com.example.posts.ui
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.posts.viewModels.PostsViewModels
//import retrofit2.http.POST
//
//class postsRvAdapter(var posts: List<POST>):RecyclerView.Adapter<postsRvAdapter.postsViewHolder>() {
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): PostsViewModels {
//        val postsListsBinding
//        val binding = postsListsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return postsViewHolder(binding)
//    }
//
//    private fun postsViewHolder(binding: ): PostsViewModels {
//
//    }
//
//    override fun onBindViewHolder(holder: PostsViewModels, position: Int) {
//        val currentpost = posts.get(position)
//        val binding = holder.binding
//
//
////        Picasso
////            .get().load(currentProduct.thumbnail)
////            .resize(80, 80)
////            .centerInside()
////            .transform(CropCircleTransformation())
////            .into(binding.ivImage)
////
////    }
////fun getItemCount(): Int {
//            return posts.size
//        }
//
//        class postsViewHolder(var binding: PostsListBinding) : RecyclerView.ViewHolder(binding.root)
//    }
//}