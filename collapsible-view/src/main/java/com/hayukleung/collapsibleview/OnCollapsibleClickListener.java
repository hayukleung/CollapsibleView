package com.hayukleung.collapsibleview;

/**
 * 树点击监听
 *
 * Created by hayukleung on 15/9/1.
 */
public interface OnCollapsibleClickListener {

  /**
   * 人员结点点击
   *
   * @param usr 叶子结点
   * @param position 所在位置
   */
  void onUsrClick(Element usr, int position);

  /**
   * 组织结点点击
   *
   * @param org 节点
   * @param position 所在位置
   * @return true: 锁定本次点击，不再执行额外操作 false: 额外执行toggle
   */
  boolean onOrgClick(Element org, int position);
}
